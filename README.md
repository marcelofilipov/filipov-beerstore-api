![GitHub](https://img.shields.io/github/license/marcelofilipov/filipov-beerstore-api)
![GitHub top language](https://img.shields.io/github/languages/top/marcelofilipov/filipov-beerstore-api)
![GitHub repo size](https://img.shields.io/github/repo-size/marcelofilipov/filipov-beerstore-api)
![Snyk Vulnerabilities for GitHub Repo](https://img.shields.io/snyk/vulnerabilities/github/marcelofilipov/filipov-beerstore-api)

# BeerStore - API

BeerStore is an API built for academic purposes.

## Installation

Installation Mode in creation

Up Terraform (AWS)
> $ ./run-terraform.sh

Up Ansible
> $ ./run-ansible.sh

Access an instance in EC2
> $ ssh ...

> $ sudo docker service create --name beerstore -e SPRING_DATASOURCE_URL=jdbc:postgresql://URL_DO_RDS_DA_SUA_CONTA:5432/beerstore -p 8080:8080 --network service <NOME_IMAGEM>:<VERSAO> --replice 3

## Usage

```python
import foobar

foobar.pluralize('word') # returns 'words'
foobar.pluralize('goose') # returns 'geese'
foobar.singularize('phenomena') # returns 'phenomenon'
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://github.com/marcelofilipov/filipov-beerstore-api/blob/master/LICENSE)
