public class ConnectionOptions {

    public ConnectionOptions bindAddress(String address){

    }
    public ConnectionOptions compress(){

    }
    public ConnectionOptions defaultAuth(String...plugin){

    }    public ConnectionOptions enableClearTextPlugin(){

    }
    public ConnectionOptions host(){

    }
    public ConnectionOptions loginPath(){

    }
    public ConnectionOptions password(){

    }
    public ConnectionOptions pipe(){

    }
    public ConnectionOptions pluginDir(){

    }
    public ConnectionOptions port(short port){

    }
    enum Protocol{
        TCP,SOCKET,PIPE,MEMORY
    }
    public ConnectionOptions protocol(Protocol protocol){

    }
    public ConnectionOptions secureAuth(){

    }
    public ConnectionOptions skipSecureAuth(){

    }
    public ConnectionOptions socket(String path){

    }
    class SSL{

    }
    public ConnectionOptions ssl(SSL ssl){

    }
    public ConnectionOptions user(String user){

    }
    public ConnectionOptions maxAllowedPacket(int maxAllowedPacket){

    }
    public ConnectionOptions netBufferLength(int netBufferLength){

    }
}
