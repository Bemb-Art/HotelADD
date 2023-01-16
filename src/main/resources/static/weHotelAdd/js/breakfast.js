


async function CargarDesayunos () {
    const res = await fetch('http://localhost/hotelADD/desayuno/obtenerDesayuno',{  
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }    
});
    const breakfasts = await res.json();
    
    console.log(breakfasts.desayunoDescripcion);
    
    
    let listadoHtml = '';
    for(let breakfast of breakfasts){
        
    let bF =`<div class="p-4 mt-2">
                <div class="d-flex justify-content-between mb-3">
                    <h5 class="mb-0">${breakfast.desayunoNombre}</h5>
                        <div class="ps-2">
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                        </div>
                </div>
                <p class="text-body mb-3">${breakfast.desayunoDescripcion} </br> ${breakfast.desayunoPrecio}">
                    <button class="btn btn-sm btn-dark rounded py-2 px-4" id="btn-ServiceModall">Add Service</button>
                </div>
            </div>`;
    
    
    bF += listadoHtml;
    }
    
    const cardBreakfastContainer = document.querySelector('#card-Breakfast-Container');
    cardBreakfastContainer.innerHTML = listadoHtml;
    
                            
}

CargarDesayunos();