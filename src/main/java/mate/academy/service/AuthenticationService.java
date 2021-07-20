package mate.academy.service;

public class AuthenticationService {
    /**
     * Imagine that some user wants to login to your site.
     * You should check if user credentials (login and password) are valid or not.
     * All users are stored in <code>UserService</code> class.
     * @param email - user's email
     * @param password - user's password
     * @return true if user by email exists and passed password is equal to user's password.
     * Return false in any other cases.
     */
    public boolean login(String email, String password) {
        if(email == null || password == null) return false;
        if(UserService.findByEmail(email) == null) return false;
        if(password == UserService.findByEmail(email).getPassword()){
            return true;
        }
        return false;
    }
}
