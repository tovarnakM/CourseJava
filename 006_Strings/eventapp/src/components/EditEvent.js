import React, { Component } from 'react';
import Header from './Header';
import { Link } from 'react-router-dom';
const axios = require('axios');

class EditEvent extends Component {

    state = {
        loading: true,
        event: []
    }

    componentDidMount(){
        const id = this.props.match.params.id;
        fetch(`http://localhost:3001/events/${id}`)
        .then(resp => resp.json())
        .then(data => {
            this.setState({event: data, loading: false})   
        })
    }

    handleEvents = (keyName, event) => {
        const eventData = this.state.event;
        for (let key in eventData){
            if (key === keyName){
                eventData[key] = event.target.value;
            }
        }
        this.setState({event: eventData});
    }

    editEvent = () => {
        const eventData = this.state.event;
        delete eventData.id;
        return Object.keys(eventData).map((keyName, i) => (
             <div key={i} style={{display: 'flex', justifyContent: 'center'}}>
                <div style={{fontSize: '1.65rem', marginTop: '32px', marginRight: '20px'}}>{keyName}:</div>
                <input 
                    key={i} 
                    value={eventData[keyName]}
                    onChange={(event) => this.handleEvents(keyName,event)}    
                /> 
            </div>
        ))
    }

    handleEditButton = () => {
        const id = this.props.match.params.id;
        const event = this.state.event;
        console.log(event)
        axios.put(`http://localhost:3001/events/${id}/`, {
            id: id,
            ...this.state.event
        }).then(resp => {
            this.props.history.push("/admin");
        }).catch(error => {
            console.log("fail", error);
        });  
    }

    handleDeleteButton = () => {
        const id = this.props.match.params.id;
        axios.delete(`http://localhost:3001/events/${id}/`)
            .then(resp => {
                this.props.history.push("/admin");
            }).catch(error => {
                console.log("fail", error);
            });  
    }

    render() {
        console.log(this.state.event)
        return (
            <div>
                <Header>
                    <div className="header__right">
                        <Link to="/admin">
                            <button className="header-button">Back to admin</button>
                        </Link>
                    </div>
                </Header>
                <div className="form">
                    <div className="form__title">Edit.</div>
                    {
                        this.state.loading ? <h2>Loading...</h2>
                        :
                        this.editEvent()
                    }
                    <button style={{marginRight: '1.2rem'}} onClick={() => this.handleEditButton()}>Edit</button>
                    <button onClick={() => this.handleDeleteButton()}>Delete</button>
                </div>
            </div>
        );
    }
}
 
export default EditEvent;