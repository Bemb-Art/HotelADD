$(document).ready(function() {
  cargarCreditos();
  $('#tbCreditos').DataTable();
});

async function cargarCreditos () {
    const res = await fetch ('http://localhost:8383/hotelADD/credito', {
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }    
});

const creditos = await res.json();

let listadoHtml = '';
for (let credito of creditos){
    let rowCredito = `<tr>
    <td>${credito.creditoNumero}</td>
    <td>${credito.clienteEmpresaFk.clienteEmpresaNombre1} ${credito.clienteEmpresaFk.clienteEmpresaNombre2} ${credito.clienteEmpresaFk.clienteEmpresaApellido1} ${credito.clienteEmpresaFk.clienteEmpresaApellido2} </td>
    <td>${credito.clienteEmpresaFk.empresaFk.empresaNombre}</td>
    <td>${credito.creditoDias}</td>
    <td>${credito.creditoEstado}</td>
    <td>${credito.creditoTotal}</td>
    </tr>`; 
        
        listadoHtml += rowCredito;
    
}
let tbCreditos = document.querySelector('#tbCreditos tbody');
tbCreditos.innerHTML = listadoHtml;

}
