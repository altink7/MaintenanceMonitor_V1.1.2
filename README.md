# SLM_MaintenanceMonitor
It is using monitors to signal the current status:

• a green monitor in case everything looks fine

• a red monitor in case of problems

## Description
A REST-based server in Java (using SpringBoot).

The service is able to manage a centrally stored message and hereby capable
to:

• reset the message

• set it to a specific message

• deliver the message to the clients using REST.

It is using a web frontend which is capable to query the message every 5 seconds.

## Help

Any advise for common problems or issues.

For messages try:
```
localhost:8080/api/monitoring/(your Message)
```
Then open Web
```
http://localhost:63342/MaintenanceMonitor_V1.1.2/templates/theme.html?_ijt=peokies9k0mj8i52jms2qrkqka&_ij_reload=RELOAD_ON_SAVE
```
and your Message will be shown :)

## Authors

Contributors names and contact info

Julian Hoffmann (wi21b050@technikum-wien.at)
-
Hudi Dautoski (wi21b053@technikum-wien.at)
-
Altin Kelmendi (wi21b054@technikum-wien.at)
-

## Version History

* 0.1
    * Initial Commit
* 1.0
    * Added Features
    * Bugs fixed

* 1.1.1
    * Added controller
    * Bugs fixed

* 1.1.2
    * Frontend change
    * Bugs fixed
    

## License

This project is licensed under the MIT License - see the LICENSE.md file for details

## Acknowledgments

Inspiration, code snippets, etc.
* [awesome-readme](https://github.com/matiassingers/awesome-readme)
* [PurpleBooth](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2)
* [dbader](https://github.com/dbader/readme-template)
* [zenorocha](https://gist.github.com/zenorocha/4526327)
* [fvcproductions](https://gist.github.com/fvcproductions/1bfc2d4aecb01a834b46)
