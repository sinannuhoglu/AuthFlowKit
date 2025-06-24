# AuthFlowKit

A modern Android authentication flow built with Jetpack Compose, MVVM architecture and Firebase Authentication.

---
## Screenshots
![Image](https://github.com/user-attachments/assets/1e5cbb0f-3f77-44ce-8d3b-f2fe54945716)
![Image](https://github.com/user-attachments/assets/b79f22ef-5e8c-4057-b504-896169d7dffc)
![Image](https://github.com/user-attachments/assets/7171c458-345d-49c7-b8c5-a3632a4d749c)

---

## Project Structure

```bash
com.sinannuhoglu.authflowkit/
│
├── navigation/             # NavHost setup and routes
├── ui/
│   ├── components/         # Reusable Composables (TextField, Buttons, etc.)
│   ├── login/              # LoginPage + ViewModel
│   ├── register/           # RegisterPage + ViewModel
│   ├── home/               # Simple HomePage
│   └── welcome/            # WelcomePage
├── theme/                  # Compose theming
└── MainActivity.kt         # Root composable entry
```

---

## Features

- Welcome Page with navigation options
- Login and Register pages with validation
- Firebase Email/Password authentication
- MVVM architecture with clean structure
- Custom reusable UI components
- Navigation with `NavHostController`

---

## Tech Stack

| Layer               | Technology / Tool                          | Description                                           |
|---------------------|---------------------------------------------|-------------------------------------------------------|
| **Language**         | Kotlin                                      | Primary language for modern Android development       |
| **UI Framework**     | Jetpack Compose                             | Declarative UI development for Android                |
| **Architecture**     | MVVM (Model-View-ViewModel)                 | Scalable and testable app structure                   |
| **Navigation**       | Navigation Compose                          | Managing screen transitions with Compose              |
| **Authentication**   | Firebase Authentication                     | Email/Password based user login system                |
| **State Management** | State + MutableStateFlow                    | Reactive UI state handling with Flow                  |
| **UI Components**    | Material3 (Material You)                    | Modern Material UI widgets and styling                |

---

## Firebase Authentication

- **Sign Up:**  
  Users register using the `createUserWithEmailAndPassword` function provided by Firebase Authentication with their email and password.

- **Sign In:**  
  Registered users log in using the `signInWithEmailAndPassword` method.

- **Error Handling:**  
  All error states (e.g., empty fields, incorrect password) are handled via `MutableStateFlow` and reflected to the UI reactively.

---

## Dependencies

- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Firebase Auth (Kotlin)](https://firebase.google.com/docs/auth/android/start)
- [Navigation Compose](https://developer.android.com/jetpack/compose/navigation)
