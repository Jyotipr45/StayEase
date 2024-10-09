# StayEase: Hotel Room Booking System

A RESTful API service built using Spring Boot to manage an online Hotel Room Booking System with MySQL as the database for persisting data.

## Features

- **Authentication and Authorization**:
  - Implemented using JWT tokens with three roles: `CUSTOMER`, `HOTEL_MANAGER`, and `ADMIN`.
  
- **User Management**:
  - **Registration**: Users register with an email, password (encrypted using BCrypt), first name, last name, and a role (defaulted to "CUSTOMER" if not specified).
  - **Login**: Users log in using email and password to receive a JWT token.

- **Hotel Management**:
  - **Hotel Details**: Store and manage hotel details like name, location, description, and room availability.
  - **Public Access**: Anyone can browse all available hotels.
  - **Admin Access**: Admins can create and delete hotels.
  - **Hotel Manager Access**: Managers can update hotel details.
  
- **Booking Management**:
  - **Book a Room**: Customers can book available rooms.
  - **Cancel a Booking**: Hotel managers can cancel bookings.

## Prerequisites

- Java 17 or higher
- MySQL

## Installation

1. **Clone the repository**:

    ```bash
    git clone https://github.com/Jyotipr45/StayEase_v1.git
    ```

2. **Navigate to the project directory**:

    ```bash
    cd StayEase_v1
    ```

## Configuration

1. Open the `application.properties` file located in `src/main/resources` directory.

2. Configure the following settings:
   1. **MySQL database connection settings**:

      ```properties
      spring.datasource.url = jdbc:mysql://localhost:3306/stay_ease
      spring.datasource.username = root
      spring.datasource.password = password
      ```

      Replace `localhost`, `3306`, `root`, and `password` with your MySQL host, port, username, and password, respectively.

   2. **JWT Security Key**:
   
      ```properties
      application.security.jwt.secret.key = your-secret-key-here
      ```

      Replace `your-secret-key-here` with your actual 256-bit JWT secret key.

3. Save the changes to the `application.properties` file.

## Running the Application

* **Using Gradle**:

    ```bash
    ./gradlew bootRun
    ```

* **Using a Generated JAR File**:

  - Build the JAR file:

    ```bash
    ./gradlew build
    ```

  - Run the generated JAR file:

    ```bash
    java -jar build/libs/stayEase-0.0.1-SNAPSHOT.jar
    ```

## API Endpoints

### **Authentication and Authorization**

1. **Register User**
   - **URL**: `/users/register`
   - **Method**: `POST`
   - **Description**: Allows users to register by providing necessary details such as email, password, first name, last name, and role.

2. **Login User**
   - **URL**: `/users/login`
   - **Method**: `POST`
   - **Description**: Authenticates a user using email and password, and returns a JWT token for further authorization.

### **Hotel Management**

1. **Create Hotel** (Admin Access)
   - **URL**: `/hotels`
   - **Method**: `POST`
   - **Description**: Allows admins to create a new hotel by providing details such as name, location, description, and room availability.

2. **Get All Hotels**
   - **URL**: `/hotels`
   - **Method**: `GET`
   - **Description**: Returns a list of all hotels with their details. Publicly accessible to all users.

3. **Get Hotel Details by ID**
   - **URL**: `/hotels/{hotelId}`
   - **Method**: `GET`
   - **Description**: Retrieves the details of a specific hotel based on its unique `hotelId`. Accessible to all users.

4. **Update Hotel** (Hotel Manager Access)
   - **URL**: `/hotels/{hotelId}`
   - **Method**: `PATCH`
   - **Description**: Allows hotel managers to update the details of a specific hotel, such as availability and description.

5. **Delete Hotel** (Admin Access)
   - **URL**: `/hotels/{hotelId}`
   - **Method**: `DELETE`
   - **Description**: Allows admins to delete a specific hotel from the system.

### **Booking Management**

1. **Book a Room** (Customer Access)
   - **URL**: `/hotels/{hotelId}/book`
   - **Method**: `POST`
   - **Description**: Allows customers to book a room in a specific hotel by providing necessary details like check-in and check-out dates.

2. **Check-In** (Hotel Manager Access)
   - **URL**: `/bookings/{bookingId}/check-in`
   - **Method**: `PATCH`
   - **Description**: Allows hotel managers to mark a booking as "checked-in" once the customer arrives at the hotel.

3. **Cancel Booking** (Hotel Manager Access)
   - **URL**: `/bookings/{bookingId}/cancel`
   - **Method**: `PATCH`
   - **Description**: Allows hotel managers to cancel an existing booking based on `bookingId`.

### **Additional Endpoints**
- The API may have additional management and auxiliary endpoints (to be updated).

## Contribution

Contributions are welcome! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a pull request.

For any major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/Jyotipr45/StayEase_v1/blob/main/LICENSE) file for details.

