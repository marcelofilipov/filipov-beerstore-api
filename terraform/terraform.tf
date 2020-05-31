terraform {
  backend "s3" {
    bucket  = "terraform-beerstore-api"
    key     = "beerstore-api"
    region  = "us-east-1"
    profile = "terraform"
  }
}

