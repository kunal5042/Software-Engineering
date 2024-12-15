```
==> Caveats
To enable phpMyAdmin in Apache, add the following to httpd.conf and
restart Apache:
    Alias /phpmyadmin /opt/homebrew/share/phpmyadmin
    <Directory /opt/homebrew/share/phpmyadmin/>
        Options Indexes FollowSymLinks MultiViews
        AllowOverride All
        <IfModule mod_authz_core.c>
            Require all granted
        </IfModule>
        <IfModule !mod_authz_core.c>
            Order allow,deny
            Allow from all
        </IfModule>
    </Directory>
Then open http://localhost/phpmyadmin
The configuration file is /opt/homebrew/etc/phpmyadmin.config.inc.php
==> Summary
🍺  /opt/homebrew/Cellar/phpmyadmin/5.2.1: 4,192 files, 48.1MB
==> Running `brew cleanup phpmyadmin`...
Disable this behaviour by setting HOMEBREW_NO_INSTALL_CLEANUP.
Hide these hints with HOMEBREW_NO_ENV_HINTS (see `man brew`).
```