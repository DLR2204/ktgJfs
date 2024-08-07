import React,{Component} from 'react';

class Calculator extends Component{

    state={a:100,b:20}

    render()
    {return(
        <div>
            <h1>Calculator</h1>
            Add:-{this.state.a+this.state.b} <br/>
            Sub:-{this.state.a-this.state.b} <br/>
            Div:-{this.state.a*this.state.b} <br/>
            Mul:-{this.state.a/this.state.b} <br/>

        </div>
    );}
    
}
export default Calculator;