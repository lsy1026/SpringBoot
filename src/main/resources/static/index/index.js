$.ajax({
    type: "GET",
    url: "/valueTest",
    success: (data) => {
    	console.log(data);
    	$('#contents').html(data);
    }
});

const mainElement = document.getElementsByClassName('main');
const MAX_HEIGHT = 3000;
var newHeight = 0;
let currentHeight = mainElement.clientHeight;

const waves = document.querySelector('.waves');

//	Add scroll event listener
window.addEventListener('scroll', function() {
	console.log("scroll Y : " + window.scrollY);

	//	infinity scroll
    //mainElement.style.height = `${window.scrollY + 1010}px`;
    
    //	MAX height used scroll
    //newHeight = Math.min(currentHeight + window.scrollY, MAX_HEIGHT);
    //mainElement.style.height = `${newHeight}px`;
	
    //	wave down scroll
    //waves.style.transform = `translate3d(0, ${window.scrollY * 0.5}px, 0)`;
});

/* @media */
document.addEventListener('DOMContentLoaded', function() {
    const menuButton = document.querySelector('.menu-button');
    const sideNav = document.querySelector('.sidenav');
    console.log("menuButton ready");

    menuButton.addEventListener('click', function() {
        sideNav.classList.toggle('show');
        console.log("menuButton action");
    });
});