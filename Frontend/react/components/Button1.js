import React,{Component} from "react";
class Button1 extends Component{

    constructor(props){

        super(props);
        
        this.state ={title:'submit Again'}}

   
submit(){
    window.alert("successfully submitted")
}


    render(){

        return(
            <div>

            <button type="button" onClick={this.submit}>{this.state.title}</button>

            </div>
        );
    }



}
export default Button1;