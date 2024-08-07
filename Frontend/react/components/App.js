import React from 'react';
import './App.css';


import Calculator from './components/Calculator';

function App() {
 
//  const name =<h1>Keerthi</h1>


// let hello = <h1>Hello everyone?<span>12</span></h1>   //js + xml =jsx

// let element = React.createElement;

// let hello1 = element('h1',{align:"center"},'How are you?',element('span',null,'Hi'));
 
  return (
    <div className="App">
      <div class="container fluid">

    <div class="row">

      {/* <Movie banner="https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:w-400.0,h-660.0,cm-pad_resize,bg-000000,fo-top:l-image,i-discovery-catalog@@icons@@star-icon-202203010609.png,lx-24,ly-615,w-29,l-end:l-text,ie-OC42LzEwICA3MTAuNksgVm90ZXM%3D,fs-29,co-FFFFFF,ly-612,lx-70,pa-8_0_0_0,l-end/et00352941-pzsgmunagx-portrait.jpg" title="Kalki" zoner="Action/Thriller/Sci-Fi"/> 
      
      
      <Movie banner="https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:w-400.0,h-660.0,cm-pad_resize,bg-000000,fo-top:l-image,i-discovery-catalog@@icons@@star-icon-202203010609.png,lx-24,ly-615,w-29,l-end:l-text,ie-OC43LzEwICAxNUsgVm90ZXM%3D,fs-29,co-FFFFFF,ly-612,lx-70,pa-8_0_0_0,l-end/et00404155-cffabnkatz-portrait.jpg" title="Shivam" zoner="Action/Thriller"/> 
      
      <Movie banner="https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:w-400.0,h-660.0,cm-pad_resize,bg-000000,fo-top:l-image,i-discovery-catalog@@icons@@star-icon-202203010609.png,lx-24,ly-615,w-29,l-end:l-text,ie-OC4yLzEwICA3My44SyBWb3Rlcw%3D%3D,fs-29,co-FFFFFF,ly-612,lx-70,pa-8_0_0_0,l-end/et00398069-qdwwfkufzz-portrait.jpg" title="Rayan" zoner="Crime"/>  */}
   
   
   {/* <State/> */}

   {/* <Button1/> */}

   <Calculator/>
   
    </div>

      </div>

    
    </div>
  );
}

export default App;
