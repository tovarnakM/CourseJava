import React, { Component } from 'react';
 
class SignIn extends Component {
    render() { 
        return (
            <div className="sign_in">
                <div className="sign_in__title">
                    Sign in.
                </div>
                <div>
                    <input type="text" placeholder="Enter email"/>
                </div>
                
                <div>
                    <input type="password" placeholder="Enter password"/>
                </div>
                <button>Submit</button>
            </div>
        );
    }
}
 
export default SignIn;