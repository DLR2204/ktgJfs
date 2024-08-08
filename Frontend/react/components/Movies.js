import { Component } from "react"

import Movie from "./Movie";
import './style.css';
import movielist from "./movielist";
class Movies extends Component{

    state=movielist;

    getMovie = movie=>{
        return <Movie banner={movie.banner} title={movie.title} zoner={movie.zoner}/>;
    }

    render(){
        return(
            <div className="movies-section">

            {this.getMovie(this.state.Kalki)}

            {this.getMovie(this.state.Rayaan)}

            {this.getMovie(this.state.DeadPool)}
  
            </div>
        );
    }

}
export default Movies;