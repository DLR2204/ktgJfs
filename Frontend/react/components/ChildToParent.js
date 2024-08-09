import React,{Component} from 'react';

export default class ChildToParent extends Component{
    state={}

    getData=(name,id)=>{
        this.setState({name:name,id:id})
    }

    render(){
        return(
            <div>
                <p>Name:-{this.state.name}</p>
                <p>Id:-{this.state.id}</p>
                <Child onChange={this.getData}/>
            </div>
        );
    }
}

class Child extends Component{

    state={name:'keerthi',id:100}

    sendData =()=>{

        this.props.onChange(this.state.name,this.state.id)
    }

    render(){
        return(
            <div>


                <button type='button' onClick={this.sendData}>Send data</button>


            </div>
        );
    }
}