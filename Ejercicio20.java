
class PasswordRegex {

    // assign your pattern string to REGEX, it will be
    // compiled to a Pattern and matched with matches()
    static final String REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9]{6,}$";
}
