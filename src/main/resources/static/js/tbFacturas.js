$(document).ready(function() {
  cargarFacturas();
  $('#tbFactuas').DataTable();
});

async function cargarFacturas () {
    const res = await fetch ('http://localhost:8383/hotelADD/ingresos/allUsuarios', {
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }    
});

const usuarios = await res.json();


let listadoHtml = '';
for (let usuario of usuarios){
    let rowUsuario = `<tr>
    <td>${usuario.usuarioId}</td>
    <td>${usuario.empleadoFk.empleadoNombre1} ${usuario .empleadoFk.empleadoNombre2} ${usuario.empleadoFk.empleadoApellido1}</td>
    <td> ${usuario.usuarioNombre}</td>
    <td>${usuario.empleadoFk.empleadoCorreo}</td>
    <td>${usuario.usuarioContrasenia}</td>
    </tr>`; 
        
        listadoHtml += rowUsuario;
    
}
let tbUsuarios = document.querySelector('#tbUsuarios tbody');
tbUsuarios.innerHTML = listadoHtml;

}

