import React from 'react';
import { Link } from 'react-router-dom';
const Home = () => {
    return (
        <div className="section-home">
            <div className="section-home_pageTitle">The Most Popular Events.</div>
            <div className="section-home_pageTitle-sub">Discover now.</div>
            <div className="section-home_wrapper">
                <div className="section-home_wrapper_left">
                    <Link to="/sign_in">
                        <button className="section-home_wrapper-button">I'm Admin</button>
                    </Link>
                </div>
                <div className="section-home_wrapper_right">
                    <Link to="/events">
                        <button className="section-home_wrapper-button">I'm looking for event</button>
                    </Link>
                </div>
            </div>
        </div>
    );
};

export default Home;