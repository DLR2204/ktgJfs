
import React,{Component} from 'react';

export default class ParentToChildComponent extends Component{
    state={name:'keerthi',
age:24}
    render(){
        return(
        <div>

            <Child name={this.state.name} age={this.state.age}/>

        </div>);
    }

}

class Child extends Component{

    render(){
        return(
            <div>
    
            <p>Name :-{this.props.name}</p>
            <p>Age :-{this.props.age}</p>
    
            </div>);
        }
    }

