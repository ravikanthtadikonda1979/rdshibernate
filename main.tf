

terraform {
  backend "s3" {
    region  = "eu-west-1"
    bucket  = "ravikanths3bucket"
    key     = "terraform.tfstate"
    encrypt = true
  }
}
