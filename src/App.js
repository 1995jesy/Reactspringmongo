import logo from './logo.svg';
import './App.css';
import React,{ Component } from 'react';
import Form from './Form.js';
import Student from './Student';
import axios from "axios";


class App extends Component{
  render(){
    return(
      <div className='App'>

<Form/>
      </div>
    )
  }
}



export default App;
