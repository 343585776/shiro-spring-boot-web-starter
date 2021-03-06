package me.sdevil507.supports.shiro.properties;

import me.sdevil507.supports.shiro.enums.Mode;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Shiro相关配置(读取application.yml中配置项)
 *
 * @author sdevil507
 */
@ConfigurationProperties(prefix = "shiro")
public class ShiroProperties {

    /**
     * shiro能力支持是否开启
     */
    private boolean enable = true;

    /**
     * 设置缓存模式
     * <p>
     * 设置shiro数据暂存模式,主要设置SessionDao与Cache的保存获取位置,可以使用该配置达到共享session目的.
     * 如果不设置,则默认为"Memory"内存模式
     * 当mode="memory"时,使用内存保存
     * 当mode="redis"时,使用redis保存
     * 后续可自行拓展
     */
    private Mode mode = Mode.MEMORY;

    /**
     * 控制session相关配置
     */
    private ShiroSessionProperties session = new ShiroSessionProperties();

    /**
     * 登录人数控制配置项
     */
    private ShiroKickoutProperties kickout = new ShiroKickoutProperties();

    /**
     * 控制cookie相关配置
     */
    private ShiroCookieProperties cookie = new ShiroCookieProperties();

    /**
     * 控制密码相关配置
     */
    private ShiroPasswordProperties password = new ShiroPasswordProperties();

    /**
     * shiro中的redis源
     */
    private ShiroRedisProperties redis = new ShiroRedisProperties();

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public ShiroSessionProperties getSession() {
        return session;
    }

    public void setSession(ShiroSessionProperties session) {
        this.session = session;
    }

    public ShiroKickoutProperties getKickout() {
        return kickout;
    }

    public void setKickout(ShiroKickoutProperties kickout) {
        this.kickout = kickout;
    }

    public ShiroCookieProperties getCookie() {
        return cookie;
    }

    public void setCookie(ShiroCookieProperties cookie) {
        this.cookie = cookie;
    }

    public ShiroPasswordProperties getPassword() {
        return password;
    }

    public void setPassword(ShiroPasswordProperties password) {
        this.password = password;
    }

    public ShiroRedisProperties getRedis() {
        return redis;
    }

    public void setRedis(ShiroRedisProperties redis) {
        this.redis = redis;
    }
}
