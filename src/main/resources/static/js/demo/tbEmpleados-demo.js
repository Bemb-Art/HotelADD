// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarEmpleados();
  $('#tbEmpleados').DataTable();
});

async function cargarEmpleados() {
const res = await fetch ('http://localhost:8383/hotelADD/empleado/allEmployes', {
  method: 'GET',
  headers: {
    'Accept': 'application/json',
    'Content-Type': 'application/json'
  }
});
const empleados = await res.json();

let listadoHtml = '';
for(let empleado of empleados){
     
    let rowEmpleado = `<tr>
    <td>${empleado.empleadoNombre1} ${empleado.empleadoNombre2} </td>
    <td>${empleado.empleadoApellido1} ${empleado.empleadoApellido2} </td>
    <td>${empleado.empleadoCorreo}</td><td>${empleado.empleadoId}</td>
    <td>${empleado.empleadoTelefono}</td>
    </tr>`; 
    listadoHtml += rowEmpleado;
}

let tbEmpleados = document.querySelector('#tbEmpleados tbody');
tbEmpleados.innerHTML = listadoHtml;

}

