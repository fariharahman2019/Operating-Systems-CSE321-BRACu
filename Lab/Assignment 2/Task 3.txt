echo "enter number"
read n
function primeNUM
{
for((i=2; i<=n/2; i++))
do
  if [ $((n%i)) -eq 0 ]
  then
    echo "$n is not a Happy prime number."
    exit
  fi
done
echo "$n is a Happy Prime number."
}
r=`primeNUM $number`
echo "$r"