//modal Home (index.html)
const btnModal = document.querySelector(".modal-btn");
const btnModa = document.querySelector(".modal-btn1");
const btnModal1 = document.querySelector('#btn-modal1');
const btnModal2 = document.querySelector('#btn-modal2');
const btnModal3 = document.querySelector('#btn-modal3');
const btnModal4 = document.querySelector('#btn-modal4');
const btnSalirModal = document.querySelector('#modal-salir');
const bookingModal  = document.querySelector(".toggle-modal");

btnModa.addEventListener('click', addBooking);
btnModal.addEventListener('click', addBooking);
btnModal1.addEventListener('click', addBooking);
btnModal2.addEventListener('click', addBooking);
btnModal3.addEventListener('click', addBooking);
btnModal4.addEventListener('click', addBooking);

btnSalirModal.addEventListener('click', (e) => {
    bookingModal.classList.add('inactive')
})

function addBooking (){
    bookingModal.classList.remove('inactive');  
}


//modal Service

