provider "aws" {
  access_key = ""
  secret_key = ""
  region = "eu-west-1"
}

resource "aws_instance" "sampleec2" {
  ami = "ami-9cbe9be5"
  instance_type = "t2.micro"
  security_groups = [
    "ravikanth_security_group"]
  tags {
    Name = "terraform-instance"
  }
}

resource "aws_s3_bucket" "ravikanths3bucket" {
  bucket = "ravikanths3bucket"
  acl = "private"
  tags {
    name = "My Bucket"
    Environment = "Dev"
  }
  versioning {
    enabled = true
  }
}
