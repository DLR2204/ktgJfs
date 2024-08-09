import React,{Component} from 'react';

class DataBinding extends Component{

    state={data:'Data is loading...'}

    updateData = (e) =>{

        this.setState({
            data:e.target.value
        })

    }

    render(){
        return(
            <div>
           <div className='card'>
                <span>Enter text:-</span> <input type="text" onChange={this.updateData}/>
            </div>
            
            <div className='card-body'>

                    <h4>{this.state.data}</h4>

            </div>

            </div>
            
        );
    }
}
export default DataBinding;