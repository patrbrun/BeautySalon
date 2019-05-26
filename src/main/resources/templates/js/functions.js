$('#calendar').datepicker({
    inline: true,
    firstDay: 1,
    showOtherMonths: true,
    dayNamesMin: ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
});

/* table row on click */

$(document).ready(function () {
    $('#activeRow tr').click(function () {
        $('#activeRow tr').removeClass("active");
        $(this).addClass("active");
        $(this).find('[name="activeRow"]').prop('checked',true);
        document.getElementById("schedule-reg").disabled = false;
    });
});

/* display payment option*/

function showResult(){
    var ele = document.getElementById("display");
    if(ele.style.display == "none") {
        ele.style.display = "block";
    }	
}

/* disable submit until a row is active*/

$(document).ready(function () {
document.getElementById("schedule-reg").disabled = true;
});

/* Welcome message*/

function welcome() {
    alert("Thank you for registration! Please sign in.");
}

/* Prevent page from refresh*/

function allOn(){
$("#register-btn").submit(function(e) {
    e.preventDefault();
});
}
