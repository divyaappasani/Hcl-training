window.onload = function(){ 

    const eventDetails = []; 

    document.getElementById("addEvent").addEventListener("click", addEvent); 

    document.getElementById('displayEvent').addEventListener("click", displayElement); 

     

    let add = document.getElementById("eventName"); 

    let successmessage = document.getElementById("successMessage"); 

    //let result = document.getElementById("result"); 

    let resultTable = document.getElementById("resultTable"); 

     

    function addEvent() { 

        let name = add.value; 
        let isAdded=true;

        resultTable.innerHTML = ""; 

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

            console.log('list is null'); 

            resultTable.innerHTML = "<tr><td>There is no valid event list to display</td></tr>"; 

        } 

        else{ 

            let str = "<tr><th>Event Names</th></tr>"; 
            eventDetails.sort;

            for (let event of eventDetails) { 

                str += "<tr><td>" + event + "</td></tr>"; 

             } 

             resultTable.innerHTML = str; 

        } 

     

     

        

     

    } 

     

  
} 

 
