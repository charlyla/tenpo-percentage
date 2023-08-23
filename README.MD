## Contact information
- Name: Carlos
- Last name: Laffitte
- Email: cnlaffitte@gmail.com

## Project Name
- Tenpo - Percentage

## Project description
- This project exposes an api ("/v1/percantage") that returns a value from 1 to 100. This value is taken by the Tenpo project, as a percentage to be applied to the sum of two numbers.
- This project needs the Tenpo project to work correctly. Both projects must be running at the same time.

## Prerequisites
- SSH access to a VPS.
- Superuser (root) privileges or a user with sudo privileges.
- This `README.md` is designed for an Ubuntu based VPS. If you are using another distribution, the commands and packages may vary. Be sure to adapt the instructions according to your operating system.

### Update system, update dependencies, add docker repository, key GPG and install docker.
- sudo apt update && sudo apt upgrade -y ()
- sudo apt install apt-transport-https ca-certificates curl software-properties-common
- curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
- sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
- sudo apt update
- sudo apt install docker-ce
- sudo systemctl enable docker
- sudo systemctl start docker

### Install docker compose
- sudo curl -L "https://github.com/docker/compose/releases/download/latest/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
- sudo chmod +x /usr/local/bin/docker-compose

### Install git, clone the repository and build and start services
- sudo apt install git -y
- git clone https://github.com/charlyla/tenpo-percentage.git
- cd tenpo-percentage
- docker-compose build
- docker-compose up -d

### Validations - Versions and servers up
- docker --version
- docker-compose --version
- docker-compose ps


