import React from 'react';

const CardList = (props) => {
    
    const renderEvents = () => {
        return props.events.map((event) => (
            <div key={event.id} className="cardList__item">
                <div className="eventInfo">
                    <div style={{fontSize: '4rem'}}>{event.title}</div>
                    <div style={{fontSize: '2.5rem', marginTop: '1.8rem'}}>{event.date}</div>
                    <div style={{fontSize: '1.5rem', marginTop: '1rem'}}>Location: {event.location}</div>
                    <div className="info_container">
                        <div>Date: {event.date}</div>
                        <div>Price: {event.price}$</div>
                    </div>
                    {
                        props.isAdmin ? 
                        <button style={{marginTop: '0.85rem'}} className="header-button">Edit event</button>
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
                    <div style={{cursor: 'pointer'}}> 
                        <div className="addEventToExisting">
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
                                <div className="addEventToExisting" >
                                    <div>
                                        <h1>+</h1>
                                    </div>
                                    <p>Add New Event</p>
                                </div>
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
