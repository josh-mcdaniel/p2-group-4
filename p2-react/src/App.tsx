import React from 'react';

import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { Login } from './components/Login/Login';
import { MainPage } from './components/MainPage/mainpage'
import { Game } from './components/Game/Game';
import { Register } from './components/Register/Register';
import { Leaderboard } from './components/Leaderboard/Leaderboard';
import { UserScore } from './components/UserScore/UserScore';

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
        <Routes>
          <Route path='/game' element={<Game/>}/>
        </Routes>
        <Routes>
          <Route path="/register" element={<Register/>}/>
        </Routes>
        <Routes>
          <Route path='/leaderboard' element={<Leaderboard/>}/>
        </Routes>
        <Routes>
          <Route path='/myScores' element={<UserScore/>}/>
        </Routes>
      </Router>
    </div>

  );
}

export default App;
