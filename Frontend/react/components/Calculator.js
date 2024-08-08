import React,{Component} from 'react';

class Calculator extends Component{

    state={a:100,b:20,showResult:false}

    setA =e=>
    {this.setState({
        
        a:parseInt(e.target.value)
    
    })}


    setB =e=>{
        this.setState({b:parseInt(e.target.value)})
    }


    setShowResult=e=>{

        this.setState(
            prevState=>{
                return{showResult:!prevState.showResult};
            
        });

    };
    
    render()
    {return(
        <div>

            <h1>Calculator</h1>

            <br/><br/>
           A:- <input type="text" className='inputA' onChange={this.setA} ></input>

           B:- <input type="text" className='inputB' onChange={this.setB}></input>

            <button type="button" onClick={this.setShowResult}>ShowResult</button>
            <br/><br/><br/>

            {this.state.showResult?(
            <div>
            Add:-{this.state.a+this.state.b} <br/>
            Sub:-{this.state.a-this.state.b} <br/>
            Mul:-{this.state.a*this.state.b} <br/>
            Div:-{this.state.a/this.state.b} <br/>
                        </div>):(

                            <div>
            <h1>Please click the showResult Button</h1>

                            </div>)}
            

        </div>
    );}
    
}
export default Calculator;