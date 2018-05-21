package work.zhili.springboot2template.model;

import java.io.Serializable;

/**
 * Title : work.zhili.springboot2template.model <br>
 * Description :
 *  <p>
 *  <ul> 
 *      <li>
 *  </ul>
 * @author chile
 * @version 1.0
 * @date 2018/4/17 11:18
 */
public class User implements Serializable {

    private static final long serialVersionUID = 6964836224325331338L;

    private int    id;
    private String username;
    private String password;
    private String nickname;
    private int    gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
