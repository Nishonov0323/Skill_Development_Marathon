package src.day_9;

public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longUrl.length(); i ++) {
            sb.append((char)(longUrl.charAt(i) - 32));
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortUrl.length(); i ++) {
            sb.append((char)(shortUrl.charAt(i) + 32));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String res = new Codec().encode("https://leetcode.com/design");
        System.out.println(res);
        System.out.println(new Codec().decode(res));
    }
}
