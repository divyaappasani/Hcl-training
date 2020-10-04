window.onload = function(){ 

    const eventDetails = []; 

    document.getElementById("push").addEventListener("click",Push); 
    document.getElementById("pop").addEventListener("click",Pop); 
    document.getElementById('display').addEventListener("click", displayElement); 

     

    let add = document.getElementById("input"); 

    let successmessage = document.getElementById("successMessage"); 

    let result = document.getElementById("result"); 

    let eventList = document.getElementById("eventList"); 

     

    function Push() { 
        let name = add.value; 
        let isAdded=true;
        eventList.innerHTML = "";
        if (name === "") { 

            successmessage.innerText = "Please Enter a valid event name"; 

        } else { 

            if(eventDetails.includes(name)){
                    successmessage.innerText='Event name already exists.Try with some other name';
                    isAdded=false;
                }
                else{
                    eventDetails.push(name);
                    add.value = "";
                    successmessage.innerText='Added successfully';
                }
                console.log(isAdded);
           
        } 
    } 
    function Pop(){
        eventDetails.pop();
        successmessage.innerText='Removed successfully';
    }

    function displayElement() { 

        successmessage.innerText = ""; 

        if(eventDetails.length === 0 ){

            successmessage.innerText = "There is no valid List to display";

        } 

        else{ 
            document.getElementById("h3").textContent="The Events in the Array";
            let str = ""; 
            for (let event of eventDetails) { 

                str += "<li>" + event + "</li>"; 

             } 

             eventList.innerHTML = str; 

        } 

    }   
} 

 
