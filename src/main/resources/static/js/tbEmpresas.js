$(document).ready(function() {
  cargarEmpresas();
  $('#tbEmpresa').DataTable();
});

async function cargarEmpresas () {
    const res = await fetch ('http://localhost:8383/hotelADD/empresas/allCompanys', {
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }    
});

const empresas = await res.json();

let listadoHtml = '';
for (let empresa of empresas){
    let rowEmpresa = `<tr>
    <td>${empresa.empresaId}</td>
    <td>${empresa.empresaNombre}</td>
    <td>${empresa.empresaNit}</td>
    <td>${empresa.empresaTelefono}</td>
    <td>${empresa.empresaCorreo}</td>
    <td>${empresa.empresaDireccion}</td>
    </tr>`; 
        
        listadoHtml += rowEmpresa;
    
}
let tbEmpresa = document.querySelector('#tbEmpresa tbody');
tbEmpresa.innerHTML = listadoHtml;

}

