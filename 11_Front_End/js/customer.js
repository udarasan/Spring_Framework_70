//save button event
$("#save-btn").click(function () {
    console.log("Clicked")
})

//update button event
$("#update-btn").click(function () {
    console.log("Clicked")
})

//delete button event
$("#delete-btn").click(function () {
    console.log("Clicked")
})

//load all button event
$("#load-all-btn").click(function () {
    $.ajax({
        url:"http://localhost:8080/10_Back_End_Web_exploded/api/v1/customer/getAll",
        method:"GET",
        success:function (response) {
            console.log(response)
        },
        error:function (error) {
            console.log(error)
        }
    })
})