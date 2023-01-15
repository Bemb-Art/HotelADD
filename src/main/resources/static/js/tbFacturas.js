$(document).ready(function() {
  cargarFacturas();
  $('#tbFactuas').DataTable();
});

async function cargarFacturas () {
    const res = await fetch ('http://localhost:8383/hotelADD/facturas/AllFacture', {
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }    
});

const facturas = await res.json();


let listadoHtml = '';
for (let factura of facturas){
    let rowFactura = `<tr>
    <td>${factura.facturaNumero} - ${factura.facturaSerie}</td>
    <td>${factura.facturaTotal}</td>
    <td>${factura.facturaEstado}</td>
    <td>${factura.clienteParticularFk.clienteParticularNombre1} ${factura.clienteParticularFk.clienteParticularNombre2} ${factura.clienteParticularFk.clienteParticularApellido1} ${factura.clienteParticularFk.clienteParticularApellido2}</td>
    <td>${factura.creditoFk.clienteEmpresaFk.clienteEmpresaNombre1} ${factura.creditoFk.clienteEmpresaFk.clienteEmpresaNombre2} ${factura.creditoFk.clienteEmpresaFk.clienteEmpresaApellido1} ${factura.creditoFk.clienteEmpresaFk.clienteEmpresaApellido2}</td>
    <td>${factura.creditoFk.creditoNumero}</td>
    <td>${factura.reservaFk.servicioId}</td>
    </tr>`; 
        
        listadoHtml += rowFactura;
    
}
let tbFactura = document.querySelector('#tbUsuarios tbody');
tbFactura.innerHTML = listadoHtml;

}

