import React,{useState} from "react";


function State(){

    const [title] = useState('SRI');

    return(

        <div>

            <button type="button">{title}</button>
        </div>
    );


}

export default State;