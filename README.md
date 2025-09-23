# B.Tech Notes Website

## Overview
The **B.Tech Notes Website** is a centralized platform for students to **browse, filter, download, and upload academic notes**. Contributors can submit content via Google Drive, and an Admin manages the system. Future enhancements include **premium access via UPI payments**.

---

## Features

- **Browse Notes:** Students can view all available notes.  
- **Apply Filters:** Filter notes by **subject, branch, semester, university**, etc.  
- **Download Notes:** Download selected notes directly from Google Drive.  
- **Upload Notes:** Contributors can submit notes along with metadata and Drive links.  
- **Read Upload Guidelines:** Contributors can view the rules before uploading.  
- **Contact Form:** Students can submit queries to the Admin.  
- **Premium Notes (Future):** Access notes marked as premium after payment.  
- **UPI Gateway (Future):** Secure payments for premium content.

---

## Actors

- **Student User:** Browse, filter, download notes, and submit queries.  
- **Contributor:** Upload notes after reading guidelines.  
- **Admin:** Manage notes, approve uploads, respond to queries.  
- **UPI Gateway (External System, Future):** Handles payments for premium content.  

---

## Use Case Diagram (Textual Representation)

Website System
+---------------------------+
| Browse Notes |
| Apply Filters |
| Download Notes |
| Read Upload Guidelines |
| Upload Notes <---extends-+
| Submit Contact Form |
| Process Payments |
| Access Premium Notes |
+---------------------------+
^ ^
| |
Student User Admin
^
|
UPI Gateway (Future)


- **«include»**: Download Notes includes Browse Notes.  
- **«extend»**: Upload Notes extends Read Upload Guidelines.  

---

## Data Flow Diagram (DFD)

### Level 0 (Context Diagram)
Student/Contributor --> Website System --> Google Drive
|
v
Email Service
^
|
Admin

**Data Flows:**
- Request Notes + Filters  
- Display Notes List  
- Download Request (with file ID)  
- Submit Query / Upload Request (metadata + Drive link)  
- Fetch File from Google Drive  
- Forward Message to Email Service  
- Manage Notes/View Queries  
- Management Actions (approve, delete, reply)

### Level 1 (Breakdown)
- **Process Notes:** Retrieve, filter, and serve notes.  
- **Handle Uploads:** Manage submissions from contributors.  
- **Process Contact Form:** Handle user queries.  
- **Process Payment (Future):** Validate premium access via UPI.  

**Data Stores:**
- **D1: Notes Metadata:** Store note information (title, subject, drive link, uploader).  
- **D2: Messages/Queries:** Store user queries and messages.  

Google Drive --> D1: Notes Metadata --> Website System --> Display Notes

--> Admin --> D2: Messages

---

## Technologies Used

- **Frontend:** HTML, CSS, JavaScript  
- **Storage:** Google Drive for notes  
- **Version Control:** Git & GitHub  

---

## Future Enhancements

- Premium note access with UPI payment integration.  
- Admin dashboard for analytics and reporting.  
- Enhanced search and filter functionality.  
