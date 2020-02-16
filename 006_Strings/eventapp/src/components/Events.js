import React, { Component } from 'react';
import CardList from './CardList';
import Header from './Header';
import { firebase } from '../Firebase';
 
class Events extends Component {

    state = {
        events: [],
        searchBox: '',
        filteredEvents: [],
        isLoading: true,
    }

    componentDidMount(){
        fetch('http://localhost:3001/events')
            .then(resp => resp.json())
            .then(data => {
                this.setState({filteredEvents: data, events: data, isLoading: false})
            })
    }

    handleInput = (event) => {
        const filtered = this.state.events.filter((events) => {
            return events.title.toLowerCase().includes(event.target.value.toLowerCase())
        })
        this.setState({filteredEvents: filtered})
    }

    handleSignOut = () => {
        firebase.auth().signOut().then(() => {
            this.props.history.push('/');  
        })        
   }

    render() {
        return (
            <div>
                {
                    this.props.isAdmin ?
                        <Header>
                            <div className="header__right">
                                <button onClick={() => this.handleSignOut()} className="header-button">Sing out</button>
                            </div>
                        </Header>

                    : <Header />
                }
                
                <div className="admin_title">
                    Discover Events.
                </div>

                <div className="searchBox">
                    <input 
                        className="searchBox-property" 
                        type="text"
                        placeholder="Find your event here ..." 
                        onChange={(event) => this.handleInput(event)}    
                    />
                </div>

                {
                    this.state.isLoading ? 
                        <div>
                            <h1 style={{textAlign: 'center'}}>
                                Loading ...
                            </h1>
                        </div>
                    :
                    
                    <CardList 
                        events={this.state.filteredEvents} 
                        isAdmin={this.props.isAdmin}     
                    />
                }

            </div>
        );
    }
}
 
export default Events;