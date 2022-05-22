import React from 'react';

import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { Login } from './components/Login/Login';
import { Game } from './components/Game/Game';



function App() {
  return (
    <div className="App">

      <Router>
        <Routes>
          <Route path="/" element={<Game/>}/>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
