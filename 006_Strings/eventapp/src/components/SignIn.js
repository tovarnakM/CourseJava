import React, { Component } from 'react';
import { firebase } from '../Firebase';
import Header from './Header';
 
class SignIn extends Component {

    state = {
        email: '',
        password: '',
        loading: false,
        successLogin: null,
    }

    handleSubmit = () => {
        this.setState({loading: true})
        firebase.auth().signInWithEmailAndPassword(this.state.email,this.state.password)
            .then(() => {
                this.setState({loading: false});
                this.props.history.push('/admin');
        }).catch(error => {
            this.setState({successLogin: false, loading: false});
        })
        this.setState({email: '', password: ''})
    }

    handleInput = (input, event) => {
       if (input === "email"){
           this.setState({email: event.target.value, successLogin: null})
       }else if (input === "password"){
           this.setState({password: event.target.value, successLogin: null})
       }
    }

    render() { 
        return (
            <div>
                <Header />
                <div className="form">
                    <div className="form__title">
                        Sign in.
                    </div>

                {
                    this.state.loading ?
                        <div style={{marginTop: '5rem', fontSize: '3rem'}}>
                            Authentification, please wait ...
                        </div>
                    :

                    <div>
                        <div>
                            <input 
                                type="text" 
                                placeholder="Enter email"
                                value={this.state.email}
                                onChange={(event) => this.handleInput("email", event)}
                            />
                        </div>
                        
                        <div>
                            <input 
                                type="password" 
                                placeholder="Enter password"
                                value={this.state.password}
                                onChange={(event) => this.handleInput("password", event)} 
                            />
                        </div>
                        <button onClick={() => this.handleSubmit()}>Submit</button>
                    </div>
                }
                {
                    this.state.successLogin === null ?
                        null
                    :
                        <div style={{marginTop: '1rem', color: 'red'}}>
                            Wrong username or password
                        </div>
                }
                
                </div>
            </div>
        );
    }
}
 
export default SignIn;