import React from 'react';

import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { Login } from './components/Login/Login';
import { MainPage } from './components/MainPage/mainpage'

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/" element={<Login/>}/>
        </Routes>
        <Routes>
          <Route path="/home" element={<MainPage/>}/>
        </Routes>
      </Router>
    </div>

  );
}

export default App;
