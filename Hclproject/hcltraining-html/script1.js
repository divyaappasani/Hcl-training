window.onload = function(){ 

    const eventDetails = []; 

    document.getElementById("addEvent").addEventListener("click", addEvent); 

    document.getElementById('displayEvent').addEventListener("click", displayElement); 

     

    let add = document.getElementById("eventName"); 

    let successmessage = document.getElementById("successMessage"); 

    let result = document.getElementById("result"); 

    let eventList = document.getElementById("eventList"); 

     

    function addEvent() { 
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
                    successmessage.innerText='Event name added successfully!';
                }
                console.log(isAdded);
           
        } 
    } 

    function displayElement() { 

        successmessage.innerText = ""; 

        if(eventDetails.length === 0 ){

            successmessage.innerText = "There is no valid List to display";

        } 

        else{ 
            document.getElementById("h3").textContent="The Event Name after sorting is";
            let str = ""; 
            let sortedeventDetails = eventDetails.sort();
            //eventDetails.sort;

            for (let event of sortedeventDetails) { 

                str += "<li>" + event + "</li>"; 

             } 

             eventList.innerHTML = str; 

        } 

     

     

        

     

    } 

     

  
} 

 
