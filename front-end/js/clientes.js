//Cargar de manera automatica los datos regostrados
// Busqueda por id
function findById(id) {
    $.ajax({
        url: 'http://localhost:9000/medicina/api/v1/medicina/pacientes/' + id,
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (item) {
        $("#id").val(item.id)
        $("#tipo_identificacion").val(item.tipoIdentificacion)
        $("#num_identificacion").val(item.identificacion)
        $("#nombre_cliente").val(item.nombresCliente)
        $("#apellidos_cliente").val(item.apellidosCliente)
        $("#telefono").val(item.telefono)
        $("#direccion_cliente").val(item.direccionCliente)
        $("#ciudad").val(item.ciudad)
        $("#estado").val(item.estado == true ? '1' : '0')
    })
}

function loadTable() {
    $.ajax({
        url: 'http://localhost:9000/medicina/api/v1/medicina/pacientes/',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (items) {
        var registros = "";
        items.forEach(function (item, index, array) {
            registros += `

                        <tr class="table-light">
                            <td>`+ item.id + `</td>
                            <td>`+ item.tipoIdentificacion + `</td>
                            <td>`+ item.identificacion + `</td>
                            <td>`+ item.nombresCliente + `</td>
                            <td>`+ item.apellidosCliente + `</td>
                            <td>`+ item.telefono + `</td>
                            <td>`+ item.direccionCliente + `</td>
                            <td>`+ item.ciudad + `</td>
                            <td>`+ (item.estado == true ? 'Activo' : 'Inactivo') + `</td>
                            <td><button class="btnEdit" type="button" onclick="findById(`+ item.id + `);"><i class="fi fi-rr-pencil"></i></button></td>
                            <td><button class="btnDelete" type="button" onclick="deleteById(`+ item.id + `);"><i class="fi fi-rr-trash"></i></button></td>
                        </tr>
                        `;
        })
        $("#dataResult").html(client_table);
    })
}

//Accion para eliminar un registro seleccionado 
function deleteById(id) {
    $.ajax({
        url: 'http://localhost:9000/medicina/api/v1/medicina/pacientes/' + id,
        method: "delete",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        const Toast = Swal.mixin({
            toast: true,
            position: 'top-end',
            showConfirmButton: false,
            timer: 4000,
            timerProgressBar: true,
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        })

        Toast.fire({
            icon: 'error',
            title: 'Usuario eliminado',
        });
        loadTable();
    })
}


//Accion de adicionar un registro
function Add() {
    $.ajax({
        url: 'http://localhost:9000/medicina/api/v1/medicina/pacientes/',
        data: JSON.stringify({
            tipoIdentificacion: $("#tipo_identificacion").val(),
            identificacion: $("#num_identificacion").val(),
            nombresCliente: $("#nombres_cliente").val(),
            apellidosCliente: $("#apellidos_cliente").val(),
            telefono: $("#telefono").val(),
            direccionCliente: $("#direccion_cliente").val(),
            ciudad: $("#ciudad").val(),
            estado: parseInt($("#estado").val())
        }),
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        //Cargar datos
        loadTable();

        //Limpiar formulario
        clearData();

        const Toast = Swal.mixin({
            toast: true,
            position: 'top-end',
            showConfirmButton: false,
            timer: 4000,
            timerProgressBar: true,
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        })

        Toast.fire({
            icon: 'success',
            title: 'Registro exitoso',
        });
    }).fail(function (jqXHR, textStatus, errorThrown) {
        // Si la respuesta es un error
        Swal.fire({
            icon: 'error',
            title: "Error",
            text: jqXHR.responseJSON.message,
        })
    });
}


//Accion de actualizar un registro
function Update() {
    $.ajax({
        url: 'http://localhost:9000/medicina/api/v1/medicina/pacientes/' + $("#id").val(),
        data: JSON.stringify({
            tipoIdentificacion: $("#tipo_identificacion").val(),
            identificacion: $("#num_identificacion").val(),
            nombresCliente: $("#nombres_cliente").val(),
            apellidosCliente: $("#apellidos_cliente").val(),
            telefono: $("#telefono").val(),
            direccionCliente: $("#direccion_cliente").val(),
            ciudad: $("#ciudad").val(),
            estado: parseInt($("#estado").val())
        }),
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        //Cargar datos
        loadTable();

        //Limpiar formulario
        clearData();

        const Toast = Swal.mixin({
            toast: true,
            position: 'top-end',
            showConfirmButton: false,
            timer: 4000,
            timerProgressBar: true,
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        })

        Toast.fire({
            icon: 'warning',
            title: 'Modificación exitosa',
        });
    })
}

// Función para limpiar datos
function clearData() {
    $("#tipo_identificacion").val(""),
    $("#identificacion").val(""),
    $("#nombres_cliente").val(""),
    $("#apellidos_cliente").val(""),
    $("#telefono").val(""),
    $("#direccion").val(""),
    $("#ciudad").val(""),
    $("#estado").val("")
}


function limpiarFiltro(){
    $("#filter-estado").val(""),
    $("#filter-nombre").val(""),
    $("#filter-ciudad").val("")
}




