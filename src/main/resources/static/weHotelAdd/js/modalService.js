const ServiceModal = document.querySelector('.service-modal');
const btnServiceModal1 = document.querySelector('#btn-ServiceModall');
const btnServiceModal2 = document.querySelector('#btn-ServiceModal2');
const btnServiceModal3 = document.querySelector('#btn-ServiceModal3');
const btnServiceSalir = document.querySelector('#modal-salirService');
 
 
btnServiceModal1.addEventListener('click', addModal);
btnServiceModal2.addEventListener('click', addModal);
btnServiceModal3.addEventListener('click', addModal);
 
btnServiceSalir.addEventListener('click', (e) => {
    ServiceModal.classList.add('inactive');
});

function addModal(){
    ServiceModal.classList.remove('inactive');
}