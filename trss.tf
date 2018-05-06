data "terraform_remote_state" "trss" {
  backend = "s3"

  config {
    bucket = "ravikanths3bucket"
    key    = "terraform.tfstate"
    region = "eu-west-1"
    encrypt = true
  }
}
