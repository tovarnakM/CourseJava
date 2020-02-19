import React from 'react';
import { Link } from 'react-router-dom';

const CardList = (props) => {
        
    const renderEvents = () => {
        return props.events.map((event) => (
            <div key={event.id} className="cardList__item">
                <div className="eventInfo">
                    <div style={{fontSize: '3.3rem'}}>{event.title}</div>
                    <div style={{fontSize: '2.3rem', marginTop: '1.4rem'}}>{event.date}</div>
                    <div style={{fontSize: '1.4rem', marginTop: '1.3rem'}}>Location: {event.location}</div>
                    <div style={{fontSize: '1.4rem', marginTop: '1.5rem'}}>Price: {event.price}$</div>
                    {
                        props.isAdmin ? 
                            <Link to={`edit_event/${event.id}`}>
                                <button
                                    style={{marginTop: '0.85rem'}} 
                                    className="header-button"
                                >Edit event</button>
                            </Link>
                        :null
                    }
                </div>
            </div>
        ))
    }

    return (
        <div>

            {
                props.isAdmin && props.events.length === 0 ?
                    <div style={{cursor: 'pointer',display: 'flex', justifyContent: 'center'}}> 
                        <div className="addEventToExisting" style={{width: '400px', height: '400px'}}>
                            <div>
                                <h1>+</h1>
                            </div>
                            <p>Add New Event</p>
                        </div>
                    </div>
            
            :
                <div className="cardList">
                    {
                        props.isAdmin ?
                            <div className="cardList__item">
                                <Link style={{textDecoration: 'none', color: 'black'}} to="/add_event" className="addEventToExisting">
                                    <div>
                                        <h1>+</h1>
                                    </div>
                                    <p>Add New Event</p>
                                </Link>
                            </div>
                        :null
                    }
                    {renderEvents()}
                </div>

            }

        </div>
    );
};

export default CardList;
