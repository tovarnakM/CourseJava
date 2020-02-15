import React from 'react';
import { Link } from 'react-router-dom';

const Header = (props) => {
    return (
        <div className="header">
            <Link to="/" className="header__left">
                <button className="header-button">Home</button>
            </Link>
            {props.children}
        </div>
    );
};

export default Header;